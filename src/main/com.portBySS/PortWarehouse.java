import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PortWarehouse {
    private int volume;
    private static final int MAX_VOLUME = 1000;
}
