package ru.vazisu.dictionary.config;

import ma.glasnost.orika.MapperFactory;
import net.rakugakibox.spring.boot.orika.OrikaMapperFactoryConfigurer;
import org.springframework.stereotype.Component;
import ru.vazisu.dictionary.domain.UseCase;
import ru.vazisu.dictionary.domain.Verb;
import ru.vazisu.dictionary.dto.RootWordDto;
import ru.vazisu.dictionary.domain.RootWord;
import ru.vazisu.dictionary.dto.UseCaseDto;
import ru.vazisu.dictionary.dto.VerbDto;

/**
 * MapperConfig.
 *
 * @author Pavel_Datunashvili
 */
@Component
public class MapperConfig implements OrikaMapperFactoryConfigurer {
    @Override
    public void configure(MapperFactory factory) {
        defaultMapping(factory, RootWord.class, RootWordDto.class);
        defaultMapping(factory, UseCase.class, UseCaseDto.class);
        defaultMapping(factory, Verb.class, VerbDto.class);
    }

    private <E, D> void defaultMapping(MapperFactory factory, Class<E> entityCls, Class<D> dtoCls) {
        factory.classMap(entityCls, dtoCls)
                .byDefault()
                .register();
    }
}
