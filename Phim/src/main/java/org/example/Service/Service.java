package org.example.Service;

import org.example.Model.Film;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Service {
    public void show(ArrayList<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public void findFilmByName(ArrayList<Film> arrayList, String fname) {
        int count = 0;
        for (Film film : arrayList) {
            if (film.getTitle().toLowerCase().contains(fname.toLowerCase())) {
                System.out.println(film);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy kết quả");
        }
    }

    public ArrayList<Film> findFilmByCategory(ArrayList<Film> filmArrayList, String fCategory) {
        ArrayList<Film> arrayList = new ArrayList<>();
        int count = 0;
        for (Film film : filmArrayList) {
            if (Arrays.toString(film.getCategory()).toLowerCase().contains(fCategory.toLowerCase())) {
                arrayList.add(film);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy kết quả");
        }
        return arrayList;
    }

    public ArrayList<Film> top3Film(ArrayList<Film> arrayList) {
        ArrayList<Film> newArrayList = new ArrayList<>();
        newArrayList.addAll(arrayList);
        newArrayList.sort(new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o2.getView() - o1.getView();
            }
        });
        ArrayList<Film> top3 = newArrayList;
        top3.add(newArrayList.get(0));
        top3.add(newArrayList.get(1));
        top3.add(newArrayList.get(2));
        return top3;
    }

    public void filmInThisYear(ArrayList<Film> filmArrayList) {
        System.out.println("Các phim công chiếu trong năm nay:");
        LocalDate localDate = LocalDate.now();
        filmArrayList.stream().filter(i -> i.getPremiereDate().getYear()==localDate.getYear()).
                forEach(i -> System.out.println(i));
    }
    public ArrayList<Film> findFilmByCategories(ArrayList<Film> filmArrayList,String fCategories){
        String[] categories=fCategories.split(",");
        ArrayList<Film> arrayList=new ArrayList<>();
        int count =0;

            for (Film film: filmArrayList){
                for (int i=0;i<categories.length;i++){
                    if (!Arrays.toString(film.getCategory()).toLowerCase().contains(categories[i].toLowerCase())){
                        count++;
                }
                }
                if (count==0){
                   arrayList.add(film);
                }
                count=0;
    }
        return arrayList;
}
}

