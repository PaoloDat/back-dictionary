package ru.vazisu.dictionary.devbootstrap;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import ru.vazisu.dictionary.domain.RootWord;
import ru.vazisu.dictionary.domain.UseCase;
import ru.vazisu.dictionary.domain.Verb;
import ru.vazisu.dictionary.enums.SpeechPartType;
import ru.vazisu.dictionary.repository.RootWordRepository;

/**
 * DevBootStrap.
 *
 * @author Pavel_Datunashvili
 */
@Slf4j
@Component
@AllArgsConstructor
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {

    private RootWordRepository rootWordRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        RootWord rootWord = new RootWord()
//                .setWord("კითხვა")
//                .setType(SpeechPartType.VERB);
//        rootWord.addMeaning("читать");
//        rootWord.addMeaning("прочитать");
//        rootWord.addUseCase(new UseCase().setOrigin("მე ვიცი კითხვა").setTranslate("Я умею читать"));
//        rootWord.addUseCase(new UseCase().setOrigin("მე არ ვიცი კითხვა").setTranslate("Я не умею читать"));
//
//        Verb verb = new Verb()
//                .setPresentOneSingle("ვკითავ")
//                .setPresentTwoSingle("კითავ")
//                .setPresentThreeSingle("კითავს");
//
//
//        rootWord.setVerb(verb);
//
//        RootWord refWord = rootWordRepository.save(rootWord);
//
//        RootWord rootWord1 = new RootWord()
//                .setWord("წაკითხული")
//                .setType(SpeechPartType.OTHER)
//                .setRefWord(refWord)
//                .addMeaning("прочитанный")
//                .addMeaning("прочитавший")
//                .addUseCase(new UseCase("წაკითხული წიგნი","Прочитанная книга"));
//
//
//        rootWordRepository.save(rootWord1);
    }
}
