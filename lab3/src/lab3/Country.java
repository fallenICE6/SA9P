package lab3;

public class Country {

    private String Name; //название страны
    private String Capital; //столица
    private String Language; //гос язык
    private Double Population; //население
    private Double Area; //площадь
    private String Num; //денежная еденица
    private String StateSystem; //гос строй
    private String Leader; //глава государства

    //Конструктор
    public Country(String Name, String Capital, String Language, Double Population, Double Area, String Num, String StateSystem, String Leader){
        this.Name = Name;
        this.Capital = Capital;
        this.Language = Language;
        this.Population = Population;
        this.Area = Area;
        this.Num = Num;
        this.StateSystem = StateSystem;
        this.Leader = Leader;
    }

    // Getters and setters
    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public String getCapital(){
        return Capital;
    }

    public void setCapital(String Capital){
        this.Capital = Capital;
    }

    public String getLanguage(){
        return Language;
    }

    public void setLanguage(String Language){
        this.Language = Language;
    }

    public Double getPopulation(){
        return Population;
    }

    public void setPopulation(Double Population){
        this.Population = Population;
    }

    public Double getArea(){
        return Area;
    }

    public void setArea(Double Area){
        this.Area = Area;
    }

    public String getNum(){
        return Num;
    }

    public void setNum(String Num){
        this.Num = Num;
    }

    public String getStateSystem(){
        return StateSystem;
    }

    public void setStateSystem(String StateSystem){
        this.StateSystem = StateSystem;
    }

    public String getLeader(){
        return Leader;
    }

    public void setLeader(String Leader){
        this.Leader = Leader;
    }

    //Вывод
    public String toString(){
        return String.format("""
                ---------------------------------
                Название страны: %s
                Столица: %s
                Государственный язык: %s
                Население: %.1f%n млн человек
                Площадь территории: %.1f%n млн км²
                Денежная единица: %s
                Государственный строй: %s
                Глава государства: %s
                ----------------------------------
                """, Name, Capital, Language, Population, Area, Num, StateSystem, Leader);
    }
}
