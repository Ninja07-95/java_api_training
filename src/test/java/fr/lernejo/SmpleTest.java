   @Test
   void dividing_by_zero_should_produce_an_exception() {
       int dividend = 10;
       int divisor = 0;
       Assertions.assertThatExceptionOfType(DivisionByZeroException.class)
             .isThrownBy(() -> Sample.divide(dividend, divisor));
   }

   @Test
   void dividing_10_by_2_should_produce_5() {
       int dividend = 10; // (1)
       int divisor = 2;
       int quotient = Sample.divide(dividend, divisor); // (2)
       Assertions.assertThat(quotient).as("quotient of 10 / 2")
             .isEqualTo(5); // (3)
   }
