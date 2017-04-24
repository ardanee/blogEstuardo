package objects;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Entrada {

    String titulo;
    String texto;
    Date fecha;
    Usuario autor;

   void createEntrada(String titulo, String texto, String fecha, Usuario autor) {
        try {
            this.titulo = titulo;
            this.texto = texto;
            this.autor = autor;
           
                DateFormat format = new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH);
                Date date = format.parse(fecha);
                this.fecha = date;
            
        } catch (ParseException e) {
          System.out.print(e);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTexto() {
        return texto;
    }

    public String getAutor() {
        return autor.alias;
    }

    public String getFecha() {
        String result = "";
       try {
           
            SimpleDateFormat formatter;
            Locale currentLocale = new Locale("en", "US");
            formatter = new SimpleDateFormat("dd/MM/yy", currentLocale);
            result = formatter.format(this.fecha);
           
        } catch (Exception e) {
            System.out.print(e);
        }
       return result; 
    }
}
