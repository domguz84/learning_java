package OOP;

public class Program {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Nauczyciel Nauczycielski");
        Student student1 = new Student("Rafał Rafalski");
        Student student2 = new Student("Roman Romański");
        Student student3 = new Student("Michał Michalski");
        Exam ex1 = teacher1.createExam(student1);
        Exam ex2 = teacher1.createExam(student2);
        Exam ex3 = teacher1.createExam(student3);
    }
}
/* Najpierw
        egzamin jest tworzony przez nauczyciela, który tworzy np. 5 pytań, o jakiejś treści i 3 odpowiedziach, z czego tylko jedna jest poprawna. Każde pytanie
        ma zapisaną poprawną odpowiedź i to ustala nauczyciel. Tylko nauczyciel może tę wartość odczytać (enkapsulacja). Następnie nauczyciel rozdaje taki
        egzamin swoim trzem studentom i każdy z nich odpowiada na pytania (podczas tworzenia studenta zdefiniuj, na które pytanie odpowie poprawnie lub
        poszukaj w internecie jak wylosować wartość z podanego przedziału).
        Po udzieleniu odpowiedzi, studenci przekazują pytania do nauczyciela, który egzaminy sprawdza i ocenia razem z określeniem kto jaką dostał ocenę.
        Zapewnij, aby student nie mógł odwołać się do informacji, których nie powinien zobaczyć (tzn. nie mógł dostać się do wartości, która odpowiedź w
        danym pytaniu jest poprawna).
        | 1
        Napisz to tak, aby klasa studenta oraz klasa nauczyciela mogły współdzielić te same cechy (pokazywałem mechanizmy jak to osiągnąć). Zdefiniuj
        również interfejsy Examinated oraz Examiner, w których będzie określone, co muszą być w stanie zrobić egzaminator (np. stworzyć egzamin, albo
        dokonać jego oceny) oraz osoba egzaminowana (np. napisać egzamin).
        Do każdego kroku dodaj drukowanie na ekranie, które pokaże jakie kroki są wykonywane w danym momencie, przykładowo tak jak poniżej:


        Teacher created 3 exams
        Student: Rafał Rafalski answering question: 1st Question content!, possible answers: [1st answer, 2nd answer, 3rd answer], answered: 3rd answer, index:[2]
        Student: Rafał Rafalski answering question: 2nd Question content!, possible answers: [1st answer, 2nd answer, 3rd answer], answered: 1st answer, index:[0]
        Student: Rafał Rafalski answering question: 3rd Question content!, possible answers: [1st answer, 2nd answer, 3rd answer], answered: 3rd answer, index:[2]*/