package View;

import java.util.List;

import javax.swing.JButton;

public interface IViewJ{

    public void print(Object o);
    public void printError(String msg);

    public static final String QUERY1 = "|      business_id       |";
    public static final String QUERY2 = "| num_reviews | num_users |";
    public static final String QUERY3 = "| month | num_reviews | distinct | average_stars |";
    public static final String QUERY4 = "| num_reviews | distinct | average_stars |";
    public static final String QUERY5 = "|      name      | num_reviews |";
    public static final String QUERY6 = "|      business_id       | num_reviews | distinct |";
    public static final String QUERY7 = "|      business_id       | num_reviews |";
    public static final String QUERY8 = "|        user_id         | num_reviews |";
    public static final String QUERY9 = "|        user_id         | num_reviews | average_stars |";
    public static final String QUERY10 = "|      business_id       | average_stars |";

    public static final String[] QUERIES = {QUERY1, QUERY2, QUERY3, QUERY4, QUERY5,
                                            QUERY6, QUERY7, QUERY8, QUERY9, QUERY10};

    public static final String SEP1 = "--------------------------";
    public static final String SEP2 = "---------------------------";
    public static final String SEP3 = "--------------------------------------------------";
    public static final String SEP4 = "------------------------------------------";
    public static final String SEP5 = "--------------------------------";
    public static final String SEP6 = "---------------------------------------------------";
    public static final String SEP7_8 = "----------------------------------------";
    public static final String SEP9 = "--------------------------------------------------------";
    public static final String SEP10 = "------------------------------------------";

    public static final String[] SEPS = {SEP1, SEP2, SEP3, SEP4, SEP5, 
                                         SEP6, SEP7_8, SEP7_8, SEP9, SEP10};

    public void showQuery(List<String> p, String msg, int query);

     /**
     * Getter do bot??o da query estat??stica 1
     * @return      Bot??o correspondente ?? query 1
     */
    public JButton getQueryE1Button();

    /**
     * Getter do bot??o da query estat??stica 2
     * @return      Bot??o correspondente ?? query 1
     */
    public JButton getQueryE2Button();

    /**
     * Getter do bot??o da query1
     * @return      Bot??o correspondente ?? query 1
     */
    
    public JButton getQuery1Button();
    /**
     * Getter do bot??o da query2
     * @return      Bot??o correspondente ?? query 2
     */
    public JButton getQuery2Button();

    /**
     * Getter do bot??o da query3
     * @return      Bot??o correspondente ?? query 3
     */
    public JButton getQuery3Button();

    /**
     * Getter do bot??o da query4
     * @return      Bot??o correspondente ?? query 4
     */
    public JButton getQuery4Button();

    /**
     * Getter do bot??o da query5
     * @return      Bot??o correspondente ?? query 5
     */
    public JButton getQuery5Button();

    /**
     * Getter do bot??o da query6
     * @return      Bot??o correspondente ?? query 6
     */
    public JButton getQuery6Button();

    /**
     * Getter do bot??o da query7
     * @return      Bot??o correspondente ?? query 7
     */
    public JButton getQuery7Button();

    /**
     * Getter do bot??o da query8
     * @return      Bot??o correspondente ?? query 8
     */
    public JButton getQuery8Button();

    /**
     * Getter do bot??o da query9
     * @return      Bot??o correspondente ?? query 9
     */
    public JButton getQuery9Button();

    /**
     * Getter do bot??o da query10
     * @return      Bot??o correspondente ?? query 10
     */
    public JButton getQuery10Button();

    /**
     * Getter do bot??o do load
     * @return      Bot??o correspondente ao load
     */
    public JButton getLoadButton();

    /**
     * Getter do bot??o de exit
     * @return      Bot??o correspondente ao exit
     */
    public JButton getExitButton();

    /**
     * Fun????o que determina se os bot??es das queries est??o dispon??veis ou n??o
     * @param bool      Booleano que defini disponibilidade das queries
     */
    public void setQueryButtonsEnable(boolean bool);

    /**
    * M??todo que determinar se os bot??es dos loads e save est??o dispon??veis
    * @param status      Booleano que indica se o model se encontra loaded
    */
    public void setLoadedStatus(boolean status);

}