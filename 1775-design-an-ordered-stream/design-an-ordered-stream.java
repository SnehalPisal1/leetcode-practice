class OrderedStream {
    private String[] stream;
    private int ptr; // pointer to track the next expected position

    public OrderedStream(int n) {
        stream = new String[n + 1]; // using 1-indexed, so size n+1
        ptr = 1; // start from position 1
    }
    
    public List<String> insert(int idKey, String value) {
        // Store the value at the given position
        stream[idKey] = value;
        
        List<String> chunk = new ArrayList<>();
        
        // If the current pointer position matches the inserted position (or we have consecutive values)
        // Output all consecutive values starting from pointer
        while (ptr < stream.length && stream[ptr] != null) {
            chunk.add(stream[ptr]);
            ptr++;
        }
        
        return chunk;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */