import java.util.HashMap;
import java.util.Objects;

public class Passport {
    private final Integer passportNum;
    private final String name;
    private final String surname;
    private final String patronymic;
    private final String birthDate;

    public static HashMap<Integer, Passport> passportMap = new HashMap<>();

    public Passport(Integer passportNum, String name, String surname, String patronymic, String birthDate) {
        this.passportNum = passportNum;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
    }

    public Passport(Integer passportNum, String name, String surname, String birthDate) {
        this.passportNum = passportNum;
        this.name = name;
        this.surname = surname;
        this.patronymic = "отсутствует";
        this.birthDate = birthDate;
    }

    public Integer getPassportNum() {
        return passportNum;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public static void addPassport(Passport passport) {
        if (!passportMap.values().iterator().next().passportNum.equals(passport.getPassportNum())) {
            passportMap.put(passport.getPassportNum(), passport);
        }else {
            passportMap.replace(passport.getPassportNum(), passport);
        }
    }

    public static void getDataOfPassport(Integer passportNum) {
        System.out.println(passportMap.get(passportNum));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return passportNum.equals(passport.passportNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNum);
    }

    @Override
    public String toString() {
        return "Имя " + name + " Фамилия " + surname + " Отчество " + patronymic + " дата рождения " + birthDate;
    }

    public static void main(String[] args) {

        Passport passport1 = new Passport(496345, "Alex", "Smith", "25.10.1987");
        Passport passport2 = new Passport(389507, "Max", "Mad", "John","15.07.1996");
        Passport passport3 = new Passport(195679, "Bob", "Dou", "28.09.1978");
        Passport passport4 = new Passport(943352, "Tim", "Gomez", "01.02.2000");
        Passport passport5 = new Passport(943352, "Tom", "Gomez", "01.02.2000");
        passportMap.put(passport1.getPassportNum(), passport1);
        passportMap.put(passport2.getPassportNum(), passport2);
        passportMap.put(passport3.getPassportNum(), passport3);
        passportMap.put(passport4.getPassportNum(), passport4);
        addPassport(passport5);
        System.out.println(passportMap);
        getDataOfPassport(passport2.getPassportNum());
    }
}
