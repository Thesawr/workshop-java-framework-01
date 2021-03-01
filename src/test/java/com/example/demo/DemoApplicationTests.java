package test.java.com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.java.com.example.demo.DemoApplication;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class DemoApplicationTests {

    @Test
    @DisplayName("ในการทำงานต้อง random ได้ค่า 5")
    public void random_5() {
    	DemoApplication demoService = new DemoApplication();
        demoService.setRandom(new Random5());
        String actualResult =demoService.generateData("somkiat");
        assertEquals("somkiat5", actualResult);
    }
    
    @Test
    @DisplayName("ในการทำงานต้อง random ได้ค่า 4")
    public void random_4() {
    	DemoApplication demoService = new DemoApplication();
        demoService.setRandom(new Random4());
        Exception exception = assertThrows(RuntimeException.class, () -> {
            String actualResult = demoService.generateData("somkiat");
        });
    }
}
    


class Random5 extends Random {
    @Override
    public int nextInt(int bound) {
        return 5;
    }
}

class Random4 extends Random {
    @Override
    public int nextInt(int bound) {
        return 4;
    }
}