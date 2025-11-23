package shorts;

public class PaginationResponse<D, C> {

    private D data;
    private C totalCount;

    public D getData() {
        return data;
    }

    public void setData(D data) {
        this.data = data;
    }

    public C getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(C totalCount) {
        this.totalCount = totalCount;
    }
}
