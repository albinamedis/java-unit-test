@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	// Напиши код здесь
    boolean expected = true;
    assertEquals ("Gользователь младше 18 лет", expected, isAdult);    
}
