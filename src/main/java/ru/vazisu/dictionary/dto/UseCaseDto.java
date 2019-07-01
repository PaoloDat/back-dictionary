package ru.vazisu.dictionary.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * UseCaseDto.
 *
 * @author Pavel_Datunashvili
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class UseCaseDto {
    private Long id;
    private String origin;
    private String translate;
}
