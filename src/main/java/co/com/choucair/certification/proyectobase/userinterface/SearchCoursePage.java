package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_UC = Target.the
            ("Selecciona Universidad Choucair").located(By.id(("universidad")));

            public static final Target INPUT_COURSE = Target.the
                    ("Buscar curso").located(By.xpath("//INPUT[@id='coursesearchbox']"));

            public static final Target BUTTON_GO = Target.the
                    ("Click para buscar el curso").located(By.xpath("//BUTTON[@class='btn btn-secondary'][text()='Ir']"));

            public static final Target SELECT_COURSE = Target.the
                    ("Selecciona el curso").located(By.xpath("//a[text()='Metodología Bancolombia']"));

            public static final Target NAME_COURSE = Target.the
                    ("Extrae el nombre del curso").located(By.xpath("//A));[@class='aalink'][text()='Metodología Bancolombia']"));
}
