package Homework_5.service.comparator;

import Homework_5.model.Team;

import java.util.Comparator;

public class StudentClassComparator<T extends Team> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getTeamName().compareTo(o2.getTeamName());
    }
}