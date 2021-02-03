package homeworks.enums;

import java.util.List;

public enum WeekDays {
    monday("Понедельник"), tuesday("Вторник"), wednesday("Среда"), thursday("Четверг"), friday("Пятница"),
    saturday("Суббота"), sunday("Воскресенье");
    String dayName;

    WeekDays(String dayName) {
        this.dayName = dayName;
    }

    @Override
    public String toString() {
        return this.name() + '(' + dayName + ')' ;
    }

}

