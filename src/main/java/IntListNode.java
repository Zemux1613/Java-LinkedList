import lombok.Getter;
import lombok.Setter;

@Getter
public class IntListNode {
    private final int value;
    @Setter
    private IntListNode nextNode;

    public IntListNode(final int value, final IntListNode nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }
}
