package ru.vazisu.dictionary.domain;

import lombok.Data;
import lombok.experimental.Accessors;
import ru.vazisu.dictionary.enums.SpeechPartType;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

/**
 * RootWord.
 *
 * @author Pavel_Datunashvili
 */
@Data
@Entity
@Accessors(chain = true)
public class RootWord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String word;

    @Enumerated(value = EnumType.STRING)
    private SpeechPartType type;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> meanings = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "ref_word_id")
    private RootWord refWord;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "verb_id")
    private Verb verb;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "root_word_id", referencedColumnName = "id")
    private List<UseCase> useCases = new ArrayList<>();

    public RootWord addMeaning(String meaning) {
        this.meanings.add(meaning);
        return this;
    }

    public RootWord addUseCase(UseCase useCase) {
        this.useCases.add(useCase);
        return this;
    }
}
