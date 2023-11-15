package model;
//Clase abstracta para extender a nuevas subclases sus caracteristicas
public abstract class Active {
    private int age, id, cellphone;
    private String home, name, lastName;
//Constructor de la clase abtracta, inicializador
    public Active(int id, String name, String lastName, int age, int cellphone, String home, String type) {
        this.age = age;
        this.id = id;
        this.cellphone = cellphone;
        this.home = home;
        this.name = name;
        this.lastName = lastName;
    }
    //getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCellphone() {
        return cellphone;
    }

    public void setCellphone(int cellphone) {
        this.cellphone = cellphone;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    //Clases internas que extienden a Active y tienen sus propias caracteristicas y metodos
    //Clase Profesor
    public static class Teacher extends Active {
        private String topic;
        public Teacher(int id, String name, String lastName, int age,  int cellphone, String home, String topic) {
            super(id, name, lastName, age, cellphone, home, "Teacher");
            this.topic = topic;
        }
        public String getTopic(){
            return topic;
        }
        public void setTopic(String topic){
            this.topic=topic;
        }
    }
    
    //Clase Trabajador
    public static class Worker extends Active {
        private String kind;
        public Worker(int id, String name, String lastName, int age,  int cellphone, String home, String kind) {
            super(id, name, lastName, age, cellphone, home, "Worker");
            this.kind = kind;
        }
        public String getKind(){
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }
    }
    
    //Clase Estudiante
    public static class Student extends Active {
        private String position;
        public Student(int id, String name, String lastName, int age,  int cellphone, String home, String position) {
            super(id, name, lastName, age, cellphone, home,"Student");
            this.position = position;
        }
        public String getPosition(){
            return position;
        }
        public void setPosition(String position){
            this.position = position;
        }
    }
}
