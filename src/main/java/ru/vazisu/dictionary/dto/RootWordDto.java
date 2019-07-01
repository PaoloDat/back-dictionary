package ru.vazisu.dictionary.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import ru.vazisu.dictionary.enums.SpeechPartType;

import java.util.List;

/**
 * RootWordDto.
 *
 * @author Pavel_Datunashvili
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class RootWordDto {
    private Long id;
    private String word;
    private SpeechPartType type;
    private List<String> meanings;
    private RootWordDto refWord;
    private List<UseCaseDto> useCases;
    private VerbDto verb;
}
