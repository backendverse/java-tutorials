package java8.streamAPI.dto;

import java.util.List;

public record User(String id, List<String> roles) {
}
