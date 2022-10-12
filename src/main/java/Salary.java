public class Salary {
    private static final long LUONG_CHEF = 50000;
    private static final long LUONG_QUANLY = 80000;
    private static final long LUONG_PHUCVU = 25000;
    public static long Salary(String chucvu, int sogio) {
        long salary = 0;
        switch (chucvu) {
            case "chef":
                if (sogio >= 1 && sogio <= 100) {
                    salary = sogio * LUONG_CHEF;
                } else if(sogio >= 101 && sogio <= 200) {
                    salary = (100 * LUONG_CHEF + 2 * (sogio - 100) * LUONG_CHEF);
                } else if(sogio >= 201) {
                    salary = (100 * LUONG_CHEF + 2 * 100 * LUONG_CHEF + 3 * (sogio - 200) * LUONG_CHEF );
                }
                break;
            case "manager" :
                if (sogio >= 1 && sogio <= 100) {
                    salary = sogio * LUONG_QUANLY;
                } else if(sogio >= 101 && sogio <= 200) {
                    salary = (100 * LUONG_QUANLY + 2 * (sogio - 100) * LUONG_QUANLY);
                } else if(sogio >= 201) {
                    salary = (100 * LUONG_QUANLY + 2 * 100 * LUONG_QUANLY + 3 * (sogio - 200) * LUONG_QUANLY );
                }
                break;
            case "waiter" :
                if (sogio >= 1 && sogio <= 100) {
                    salary = sogio * LUONG_PHUCVU;
                } else if(sogio >= 101 && sogio <= 200) {
                    salary = (100 * LUONG_PHUCVU + 2 * (sogio - 100) * LUONG_PHUCVU);
                } else if(sogio >= 201) {
                    salary = (100 * LUONG_PHUCVU + 2 * 100 * LUONG_PHUCVU + 3 * (sogio - 200) * LUONG_PHUCVU );
                }
                break;
            default: salary = 0;

        }
        return salary;
    }
}
