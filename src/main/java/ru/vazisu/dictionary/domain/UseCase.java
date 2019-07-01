package ru.vazisu.dictionary.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * UseCase.
 *
 * @author Pavel_Datunashvili
 */
@Data
@Entity
@Accessors(chain = true)
public class UseCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String origin;
    private String translate;

    public UseCase(String origin, String translate) {
        this.origin = origin;
        this.translate = translate;
    }

    public UseCase() {
    }
}
