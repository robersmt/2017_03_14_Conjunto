import org.junit.Test;
import static org.junit.Assert.*;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'Sonia' at '14/03/17 11:07' with Gradle 2.14.1
 *
 * @author Sonia, @date 14/03/17 11:07
 */
public class LibraryTest {

        //----------------------------------------------------------------------
        //----------------------------------------------------------------------
    @Test public void provarQueAlPrincipiLaTallaEs0() {
        Conjunto c1 = new Conjunto();

                assertEquals (0, c1.talla ());

    }

        //----------------------------------------------------------------------
        //----------------------------------------------------------------------
         @Test public void provarQueNoHiHanDuplicats() {
        Conjunto c1 = new Conjunto();

                c1.anyadir (3.4);
                c1.anyadir (4.5);
                c1.anyadir (3.4);


                assertEquals (2, c1.talla ());

                assertEquals (true, c1.contiene (3.4) );
                assertEquals (false, c1.contiene (8.9) );


    }

    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    @Test public void provarQueFuncionaUnir() {
   Conjunto c1 = new Conjunto();
   Conjunto a = new Conjunto();
   Conjunto c2 = new Conjunto();

              a.anyadir (2.1);
              a.anyadir (5.3);
              a.anyadir (3.4);

              c1.anyadir (3.4);
              c1.anyadir (4.5);


              c2 = c1.unir (a);

              assertEquals (true, c2.contiene (2.1) );
              assertEquals (true, c2.contiene (5.3) );
              assertEquals (true, c2.contiene (3.4) );
              assertEquals (true, c2.contiene (4.5) );

              assertEquals (4, c2.talla ());
    }


}
