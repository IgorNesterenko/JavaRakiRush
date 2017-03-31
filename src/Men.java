/**
 * Created by user on 17.03.2017.
 */
import com.sun.corba.se.impl.orb.ParserTable;

    /**
     * Created by user on 14.03.2017.
     */




    public class Men {


        public static final String NAME_IS = "Name is: ";
        public static final String LAST_NAME_IS = "Last name is: ";
        private  String name;
        private  String lastName;
        private String proffessiion;
        private int years;
        private int workYears;

        public Men() {

        }

        public String getName() {
            System.out.println(NAME_IS + name);
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            System.out.println(LAST_NAME_IS + lastName);
            return   lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getProffessiion() {
            return proffessiion;
        }

        public void setProffessiion(String proffessiion) {
            this.proffessiion = proffessiion;
        }

        public int getYears() {
            return years;
        }

        public void setYears(int years) {
            this.years = years;
        }

        public int getWorkYears() {
            return workYears;
        }

        public void setWorkYears(int workYears) {
            this.workYears = workYears;
        }
        public static void print(String name, Object num){
            System.out.println(name + num);

        }
    }


