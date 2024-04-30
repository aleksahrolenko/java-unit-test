@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("Ожидалось, что для пользователя старше 18 лет метод вернет true, но вернулось false.", true, isAdult);// Напиши код здесь
}