package org.mach.projects.literalura.repository;

import org.mach.projects.literalura.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Livro, Long> {
    @Query("SELECT COUNT(b) > 0 FROM Livro b WHERE b.title LIKE %:title%")
    Boolean verifiedBDExistence(@Param("title") String title);

    @Query("SELECT b FROM Livro b JOIN b.languages l WHERE l = :language")
    List<Livro> findBooksByLanguage(@Param("language") String language);

    @Query("SELECT b FROM Livro b ORDER BY b.downloads DESC LIMIT 10")
    List<Livro> findTop10();
}
