package Controller;

import Main.IGestReviews;
import View.IViewJ;

public interface IControllerJ {

    /**
     * Setter do Model 
     * @param model            Modelo que queremos implementar
     */
    public void setModel(IGestReviews model);

    /**
     * Setter da View 
     * @param view            View que queremos implementar
     */
    public void setView(IViewJ view);


     /**
     * Método que atribui as funções às diferentes teclas
     */
    public void start();

    /**
     * Controlador responsável pelo carregamento de ficheiros
     */
    public void loadFromFiles();

    /**
     * Controlador responsável pela Query Estatística 1
     */
    public void queryE1();

    /**
     * Controlador responsável pela Query Estatística 2
     */
    public void queryE2();

    /**
     * Lista ordenada alfabeticamente com os identificadores dos negócios nunca avaliados e
     *  o seu respetivo total
     */
    public void query1();

    /**
     * Dado um mês e um ano (válidos), determinar o número total global de
     *  reviews realizadas e o número total de users distintos que as realizaram
     */
    public void query2();

    /**
     * Dado um código de utilizador, determinar, para cada mês,
     *  quantas reviews fez, quantos negócios distintos avaliou e que nota média atribuiu
     */
    public void query3();

    /**
     *  Dado o código de um negócio, determinar, mês a mês, quantas vezes foi avaliado, por quantos users diferentes e a média de classificação
     */
    public void query4();    

    /**
     * Dado o código de um utilizador determinar a lista de nomes de negócios que mais
     * avaliou (e quantos), ordenada por ordem decrescente de quantidade e, para
     * quantidades iguais, por ordem alfabética dos negócios
     */
    public void query5();

    /**
     * Determinar o conjunto dos X negócios mais avaliados (com mais reviews) em cada
     * ano, indicando o número total de distintos utilizadores que o avaliaram (X é um
     * inteiro dado pelo utilizador)
     */
    public void query6();

    /**
     * Determinar, para cada cidade, a lista dos três mais famosos negócios
     * em termos de número de reviews
     */
    public void query7();

    /**
     * Determinar os códigos dos X utilizadores (sendo X dado pelo utilizador) que 
     * avaliaram mais negócios diferentes, indicando quantos, sendo o critério de
     * ordenação a ordem decrescente do número de negócios
     */
    public void query8();

    /**
     * Dado o código de um negócio, determinar o conjunto dos X users que mais o 
     * avaliaram e, para cada um, qual o valor médio de classificação (ordenação cf. 5)
     */
    public void query9();

    /**
     * Determinar para cada estado, cidade a cidade, a média de classificação de cada negócio.
     */
    public void query10();
}