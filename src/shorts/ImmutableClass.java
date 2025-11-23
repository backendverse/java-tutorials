package shorts;

import java.util.ArrayList;
import java.util.List;

// 1. Make The Class Final, So That No Other Class Can Inherit It
public final class ImmutableClass {

    // 2. Make All The Fields Final, So That Their Values Can Only Be Set Once
    // Using constructor while creating an object of this class
    private final String id;
    private final List<String> roles;

    public ImmutableClass(
            String id,
            List<String> roles) {
        this.id = id;
        // 3. Perform Deep Copy For Mutable Objects/Collections (to avoid external modification)
        this.roles = new ArrayList<>(roles);
    }

    // 4. No Setters to prevent modification of fields after object creation
    public String getId() {
        return id;
    }

    public List<String> getRoles() {
        // 5. Always Return a Copy For Mutable Objects/Collections to maintain immutability
        return new ArrayList<>(roles);
    }
}
