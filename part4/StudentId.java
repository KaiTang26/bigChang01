class Student{
    int id;

    public Student(int id){
        this.id = id;
    }
}

class Class{

    public Student[] Students;

    public Class(int n){

        this.Students = new Student[n];
        for (int i=0; i<n; i++){

            //Student st = new Student(i);
            this.Students[i] = new Student(i);
        }
    }

}