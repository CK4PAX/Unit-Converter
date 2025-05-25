package com.unbroken.unitConverter;

import com.unbroken.unitConverter.controllers.LengthControler;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnitConverterApplicationTests {
    
        @Autowired
        private LengthControler lengthController;

	@Test
	void contextLoads() {
            Assertions.assertThat(lengthController)
                    .isNotNull();
	}
}