package ru.vazisu.dictionary.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Verb.
 *
 * @author Pavel_Datunashvili
 */
@Data
@Entity
@Accessors(chain = true)
public class Verb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String presentOneSingle;
    private String presentTwoSingle;
    private String presentThreeSingle;
    private String presentOnePlural;
    private String presentTwoPlural;
    private String presentThreePlural;
}
