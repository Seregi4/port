import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Port {
    private PortWarehouse portWarehouse;
    private List<Berth> berths;
}