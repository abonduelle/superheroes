package superheroes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class SuperHero {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column @NotNull @NotBlank
    private String nom;

    @Column @NotNull @NotBlank
    private String ville;
    
    @Column  @NotNull
    private int longitude;
    
    @Column  @NotNull
    private int latitude;
    
    @Column @NotNull @NotBlank
    private String numeroTel;
    
    @Column @NotNull @NotBlank
    private String logIn;

    @Column @NotNull @NotBlank
    private String motDePasse;

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    
    public int getLongitude() {
        return longitude;
    }
    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }
    
    public int getLatitude() {
        return latitude;
    }
    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }
    
    public String getNumeroTel() {
        return numeroTel;
    }
    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }
    
    public String getLogIn() {
        return logIn;
    }
    public void setLogIn(String logIn) {
        this.logIn = logIn;
    }
    public String getMotDePasse() {
        return motDePasse;
    }
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    @OneToMany(mappedBy = "superHero")
    //@Min(3)
    //@Max(6)
    List<SuperHeroTypeIncident> SuperHeroTypeIncident;


    public SuperHero(Long id, @NotNull @NotBlank String nom, @NotNull @NotBlank String ville, @NotNull int longitude,
            @NotNull int latitude, @NotNull @NotBlank String numeroTel, @NotNull @NotBlank String logIn,
            @NotNull @NotBlank String motDePasse, List<superheroes.SuperHeroTypeIncident> superHeroTypeIncident) {
        this.id = id;
        this.nom = nom;
        this.ville = ville;
        this.longitude = longitude;
        this.latitude = latitude;
        this.numeroTel = numeroTel;
        this.logIn = logIn;
        this.motDePasse = motDePasse;
        SuperHeroTypeIncident = superHeroTypeIncident;
    }
    public SuperHero(){
        
    }
}
