package singleton;

public class Configuration {

    private static Configuration instance;

    private String idioma;
    private String tema;

    private Configuration(){
        this.idioma = "Português";
        this.tema = "Escuro";
    }

    public static Configuration getInstance(){
        if(instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    // getters e setters

    public String getIdioma() {return idioma;}
    public String getTema() {return tema;}

    public void setIdioma(String idioma) {
        if (idioma != null){
            this.idioma = idioma;
        } else throw new IllegalArgumentException("Erro! Insira um valor válido para idioma.");
    }

    public void setTema(String tema) {
        if (tema != null) {
            this.tema = tema;
        } else throw new IllegalArgumentException("Erro! Insira um valor válido para tema.");
    }


}
