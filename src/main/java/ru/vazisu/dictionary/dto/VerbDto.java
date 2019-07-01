package ru.vazisu.dictionary.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * VerbDto.
 *
 * @author Pavel_Datunashvili
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class VerbDto {
    private Long id;
    private String presentOneSingle;
    private String presentTwoSingle;
    private String presentThreeSingle;
    private String presentOnePlural;
    private String presentTwoPlural;
    private String presentThreePlural;
}
