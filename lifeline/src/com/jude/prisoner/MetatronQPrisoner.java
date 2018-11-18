public class MetatronQPrisoner implements Prisoner {
    int totalPerson;
    int totalCount;

    @Override
    public String getName() {
        return "陈富2018210409";
    }

    @Override
    public void begin(Manager manager, int totalPerson, int totalCount) {
        this.totalPerson = totalPerson;
        this.totalCount = totalCount;
    }

    @Override
    public int take(int index, int last) {
        return index;//我就测试一下能不能上传，就先死吧
    }
    @Override
    public void result(boolean survived) {

    }
}