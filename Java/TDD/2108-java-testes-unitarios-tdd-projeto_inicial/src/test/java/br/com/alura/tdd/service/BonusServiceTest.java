package br.com.alura.tdd.service;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

@Test
void bonusDeveriaSerZeroParaFuncionarioDeSalarioMuitoAlto(){
    BonusService service = new BonusService();

    ///há duas formas de se lidar com Excepion com o JUnit, forma 1 está comentada a baixo
//    assertThrows(IllegalArgumentException.class,
//            () -> service.calcularBonus(new Funcionario("João" , LocalDate.now(), new BigDecimal("250000"))));

    //Forma 2:
     try {
         service.calcularBonus(new Funcionario("João" , LocalDate.now(), new BigDecimal("250000")));
         fail("Não deu a Exception esperada");
     } catch (Exception e) {
         assertEquals("Funcionário com Sálario maior que R$10.000,00 não pode receber bonus.",e.getMessage());
     }



}

    @Test
    void bonusDeveriaSer10PorCentoDoSalario(){
        BonusService service = new BonusService();
        BigDecimal bonus= service.calcularBonus(new Funcionario("João" , LocalDate.now(), new BigDecimal("2500")));

        assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    void bonusDeveriaSer10PorCentoParaSalarioDeExatamente10000(){
        BonusService service = new BonusService();
        BigDecimal bonus= service.calcularBonus(new Funcionario("João" , LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.00"), bonus);
    }
}