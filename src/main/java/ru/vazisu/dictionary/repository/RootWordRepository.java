package ru.vazisu.dictionary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.vazisu.dictionary.domain.RootWord;

import java.util.List;
import java.util.Optional;

/**
 * RootWordRepository.
 *
 * @author Pavel_Datunashvili
 */
@Repository
public interface RootWordRepository extends JpaRepository<RootWord, Long> {

    Optional<RootWord> findByWord(String word);

//    @Query("select rw from RootWord  rw where rw.word like %:query%")
    List<RootWord> findAllByWordContaining(@Param("query") String word);
}
