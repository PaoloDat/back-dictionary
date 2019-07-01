package ru.vazisu.dictionary.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.glasnost.orika.MapperFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.vazisu.dictionary.dto.RootWordDto;
import ru.vazisu.dictionary.domain.RootWord;
import ru.vazisu.dictionary.repository.RootWordRepository;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * MainController.
 *
 * @author Pavel_Datunashvili
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api/word")
public class MainController {

    private MapperFacade mapperFacade;
    private RootWordRepository rootWordRepository;

    @GetMapping
    public List<RootWordDto> getRelevantWords(@NotNull @RequestParam("query") String query) {
        List<RootWord> allByWordLike = rootWordRepository.findAllByWordContaining(query);
        return mapperFacade.mapAsList(allByWordLike, RootWordDto.class);
    }
}
