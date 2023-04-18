package pl.zajecia.seriale.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
public class TvSeriesCassete {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String title;
    private LocalDate productionYear;

    public TvSeriesCassete() {
    }

    public TvSeriesCassete(Long id, String title, LocalDate productionYear) {
        this.id = id;
        this.title = title;
        this.productionYear = productionYear;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getProductionYear() {
        return productionYear;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setProductionYear(LocalDate productionYear) {
        this.productionYear = productionYear;
    }
}
