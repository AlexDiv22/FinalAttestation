public class Main {
    public static void main(String[] args) {
        Pets PetsList = new Pets();
        Pack_animal PackList = new Pack_animal();
        for (Cats cat : PetsList.getListCats()) {
            System.out.print(cat.getPersonal_name() + " " + cat.getAnimalClass());
        }

        for (Cats cat : PetsList.getListCats()) {
            System.out.print(cat.getPersonal_name() + " " + cat.getAnimal_name() + " ");
        }
        System.out.println();

        for (Horses cat : PackList.getListHorses()) {
            System.out.print(cat.getPersonal_name() + " " + cat.getAnimal_name() + " ");
        }

        System.out.println();

        String standartPetsComands[] = { "Сидеть", "Голос", "Иди ко мне" };

        Cats testCat1 = new Cats("001", "2016/11/10", "Кошка", standartPetsComands, "Тася");
        Cats testCat2 = new Cats("002", "2017/07/04", "Кошка", standartPetsComands, "Барсик");
        Cats testCat3 = new Cats("003", "2020/02/12", "Кошка", standartPetsComands, "Боня");
        Dogs testDog1 = new Dogs("004", "2015/04/22", "Собака", standartPetsComands, "Лайка");
        Dogs testDog2 = new Dogs("005", "2018/03/05", "Собака", standartPetsComands, "Каштанка");

        PetsList.getListCats().add(testCat1);
        PetsList.getListCats().add(testCat2);
        PetsList.getListCats().add(testCat3);

        PetsList.getListDogs().add(testDog1);
        PetsList.getListDogs().add(testDog2);

        App getApp = new App();
        getApp.start(PetsList, PackList);
    }
}