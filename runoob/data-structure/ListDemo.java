import java.util.ArrayList;
import java.util.List;


// FilterRowContainer 类定义
class FilterRowContainer {
    private final String id;
    private final List<String> items;

    public FilterRowContainer(String id, List<String> items) {
        this.id = id;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public List<String> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "FilterRowContainer(id=\"" + id + "\", items=" + items + ")";
    }
}

public class ListDemo {



    public static void main(String[] args) {

        // 创建 FilterRowContainer 列表
        List<FilterRowContainer> rowContainerList = new ArrayList<FilterRowContainer>();

        int size = rowContainerList.size();
        System.out.println("Initial size: " + size);

        FilterRowContainer container1 = new FilterRowContainer(String.valueOf(size), List.of("a"));

        rowContainerList.add(container1);

        System.out.println("Size after adding one container: " + rowContainerList.size());

        
        // 方法1：逐个添加
        // rowContainerList.add(new FilterRowContainer("0", List.of("A", "B", "C")));
        // rowContainerList.add(new FilterRowContainer("1", List.of("D", "E")));
        
        // 打印结果
        System.out.println("FilterRowContainer List:");
        for (FilterRowContainer container : rowContainerList) {
            System.out.println(container);
        }
        
        System.out.println("\n---分隔线---\n");

    }
}
