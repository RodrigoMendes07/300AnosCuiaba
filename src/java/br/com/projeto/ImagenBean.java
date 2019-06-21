package br.com.projeto;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_imagen")
public class ImagenBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idImagen;
    @Column
    private String titulo;
    @Column
    @Temporal(TemporalType.DATE)
    private Calendar data;
    @Column
    private String dimensao;
    @Column
    private String autor;
    @Column
    private String imagem;
    @Column
    private String procedimento;
    @Column
    private String instituicao;

    public ImagenBean() {
    }

    public ImagenBean(int idImagen, String titulo, Calendar data, String dimensao, String autor, String imagem, String procedimento, String instituicao) {
        this.idImagen = idImagen;
        this.titulo = titulo;
        this.data = data;
        this.dimensao = dimensao;
        this.autor = autor;
        this.imagem = imagem;
        this.procedimento = procedimento;
        this.instituicao = instituicao;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

        public String getDtaFormatada(){
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");              
        return f.format(data);
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getDimensao() {
        return dimensao;
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    @Override
    public String toString() {
        return "ImagenBean{" + "titulo=" + titulo + ", data=" + data + ", dimensao=" + dimensao + ", autor=" + autor + ", imagem=" + imagem + ", procedimento=" + procedimento + ", instituicao=" + instituicao + '}';
    }
        
}