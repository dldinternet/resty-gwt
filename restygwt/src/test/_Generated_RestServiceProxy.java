public class _Generated_RestServiceProxy {
    private org.fusesource.restygwt.client.Resource resource = null;

    public void setResource(org.fusesource.restygwt.client.Resource resource) {
        this.resource = resource;
    }

    public org.fusesource.restygwt.client.Resource getResource() {
        if (this.resource == null) {
            String serviceRoot = org.fusesource.restygwt.client.Defaults.getServiceRoot();
            this.resource = new org.fusesource.restygwt.client.Resource(serviceRoot).resolve("/pizza-service");
        }
        return this.resource;
    }

    private org.fusesource.restygwt.client.Dispatcher dispatcher = null;

    public void setDispatcher(org.fusesource.restygwt.client.Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    public org.fusesource.restygwt.client.Dispatcher getDispatcher() {
        return this.dispatcher;
    }

    public void listToppings(org.fusesource.restygwt.client.MethodCallback<java.util.List<org.fusesource.restygwt.examples.client.Topping>> callback) {
        final org.fusesource.restygwt.client.Method __method =
                getResource()
                        .resolve("/toppings")
                        .get();
        __method.setDispatcher(this.dispatcher);
        __method.header(org.fusesource.restygwt.client.Resource.HEADER_ACCEPT, "application/json");
        try {
            __method.send(new org.fusesource.restygwt.client.AbstractRequestCallback<java.util.List<org.fusesource.restygwt.examples.client.Topping>>(__method, callback) {
                protected java.util.List<org.fusesource.restygwt.examples.client.Topping> parseResult() throws Exception {
                    try {
                        public static final Topping_Generated_JsonEncoderDecoder_ INSTANCE = new Topping_Generated_JsonEncoderDecoder_();
                    public com.google.gwt.json.client.JSONValue encode (org.fusesource.restygwt.examples.client.Topping
                    value){
                        if (value == null) {
                            return null;
                        }
                        com.google.gwt.json.client.JSONObject rc = new com.google.gwt.json.client.JSONObject();
                        org.fusesource.restygwt.examples.client.Topping parseValue = (org.fusesource.restygwt.examples.client.Topping) value;
                        {
                            com.google.gwt.json.client.JSONValue v = org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.name);
                            if (v != null) {
                                rc.put("name", v);
                            }
                        }
                        {
                            com.google.gwt.json.client.JSONValue v = org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.DOUBLE.encode(parseValue.price);
                            if (v != null) {
                                rc.put("price", v);
                            }
                        }
                        return rc;
                    }
                    public Topping decode (com.google.gwt.json.client.JSONValue value){
                        if (value == null || value.isNull() != null) {
                            return null;
                        }
                        com.google.gwt.json.client.JSONObject object = toObject(value);
                        org.fusesource.restygwt.examples.client.Topping rc = new org.fusesource.restygwt.examples.client.Topping();
                        if (object.get("name") != null) {
                            if (object.get("name") instanceof com.google.gwt.json.client.JSONNull) {
                                rc.name = null;
                            } else {
                                rc.name = org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("name"));
                            }
                        }
                        if (object.get("price") != null) {
                            if (object.get("price") instanceof com.google.gwt.json.client.JSONNull) {
                                rc.price = null;
                            } else {
                                rc.price = org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.DOUBLE.decode(object.get("price"));
                            }
                        }
                        return rc;
                    }
                    return org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.toList(com.google.gwt.json.client.JSONParser.parse(__method.getResponse().getText()), org.fusesource.restygwt.examples.client.Topping_Generated_JsonEncoderDecoder_.INSTANCE);
                    }catch(Throwable __e){
                        throw new org.fusesource.restygwt.client.ResponseFormatException("Response was NOT a valid JSON document", __e);
                    }
                }
            });
        } catch (com.google.gwt.http.client.RequestException __e) {
            callback.onFailure(__method, __e);
        }
    }

    public void order(org.fusesource.restygwt.examples.client.PizzaOrder request, org.fusesource.restygwt.client.MethodCallback<org.fusesource.restygwt.examples.client.OrderConfirmation> callback) {
        final org.fusesource.restygwt.examples.client.PizzaOrder final_request = request;
        final org.fusesource.restygwt.client.Method __method =
                getResource()
                        .post();
        __method.setDispatcher(this.dispatcher);
        __method.header(org.fusesource.restygwt.client.Resource.HEADER_ACCEPT, org.fusesource.restygwt.client.Resource.CONTENT_TYPE_JSON);
        public static final PizzaOrder_Generated_JsonEncoderDecoder_ INSTANCE = new PizzaOrder_Generated_JsonEncoderDecoder_();

    public com.google.gwt.json.client.JSONValue encode(org.fusesource.restygwt.examples.client.PizzaOrder value) {
        if (value == null) {
            return null;
        }
        com.google.gwt.json.client.JSONObject rc = new com.google.gwt.json.client.JSONObject();
        org.fusesource.restygwt.examples.client.PizzaOrder parseValue = (org.fusesource.restygwt.examples.client.PizzaOrder) value;
        {
            com.google.gwt.json.client.JSONValue v = org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.phone_number);
            if (v != null) {
                rc.put("phone_number", v);
            }
        }
        {
            com.google.gwt.json.client.JSONValue v = org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.BOOLEAN.encode(parseValue.delivery);
            if (v != null) {
                rc.put("delivery", v);
            }
        }
        {
            com.google.gwt.json.client.JSONValue v = org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.toJSON(parseValue.delivery_address, org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING);
            if (v != null) {
                rc.put("delivery-address", v);
            }
        }
        public static final Pizza_Generated_JsonEncoderDecoder_ INSTANCE = new Pizza_Generated_JsonEncoderDecoder_();

    public com.google.gwt.json.client.JSONValue encode(org.fusesource.restygwt.examples.client.Pizza value) {
        if (value == null) {
            return null;
        }
        com.google.gwt.json.client.JSONObject rc = new com.google.gwt.json.client.JSONObject();
        org.fusesource.restygwt.examples.client.Pizza parseValue = (org.fusesource.restygwt.examples.client.Pizza) value;
        {
            com.google.gwt.json.client.JSONValue v = org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.INT.encode(parseValue.quantity);
            if (v != null) {
                rc.put("quantity", v);
            }
        }
        {
            com.google.gwt.json.client.JSONValue v = org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.INT.encode(parseValue.size);
            if (v != null) {
                rc.put("size", v);
            }
        }
        {
            com.google.gwt.json.client.JSONValue v = org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.encode(parseValue.crust);
            if (v != null) {
                rc.put("crust", v);
            }
        }
        {
            com.google.gwt.json.client.JSONValue v = org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.toJSON(parseValue.toppings, org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING);
            if (v != null) {
                rc.put("toppings", v);
            }
        }
        return rc;
    }

    public Pizza decode(com.google.gwt.json.client.JSONValue value) {
        if (value == null || value.isNull() != null) {
            return null;
        }
        com.google.gwt.json.client.JSONObject object = toObject(value);
        org.fusesource.restygwt.examples.client.Pizza rc = new org.fusesource.restygwt.examples.client.Pizza();
        if (object.get("quantity") != null) {
            if (object.get("quantity") instanceof com.google.gwt.json.client.JSONNull) {
                rc.quantity = 0;
            } else {
                rc.quantity = org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.INT.decode(object.get("quantity"));
            }
        }
        if (object.get("size") != null) {
            if (object.get("size") instanceof com.google.gwt.json.client.JSONNull) {
                rc.size = 0;
            } else {
                rc.size = org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.INT.decode(object.get("size"));
            }
        }
        if (object.get("crust") != null) {
            if (object.get("crust") instanceof com.google.gwt.json.client.JSONNull) {
                rc.crust = null;
            } else {
                rc.crust = org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("crust"));
            }
        }
        if (object.get("toppings") != null) {
            if (object.get("toppings") instanceof com.google.gwt.json.client.JSONNull) {
                rc.toppings = null;
            } else {
                rc.toppings = org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.toList(object.get("toppings"), org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING);
            }
        }
        return rc;
    }

    {
        com.google.gwt.json.client.JSONValue v = org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.toJSON(parseValue.pizzas, org.fusesource.restygwt.examples.client.Pizza_Generated_JsonEncoderDecoder_.INSTANCE);
        if (v != null) {
            rc.put("pizzas", v);
        }
    }

    return rc;
}

    public PizzaOrder decode(com.google.gwt.json.client.JSONValue value) {
        if (value == null || value.isNull() != null) {
            return null;
        }
        com.google.gwt.json.client.JSONObject object = toObject(value);
        org.fusesource.restygwt.examples.client.PizzaOrder rc = new org.fusesource.restygwt.examples.client.PizzaOrder();
        if (object.get("phone_number") != null) {
            if (object.get("phone_number") instanceof com.google.gwt.json.client.JSONNull) {
                rc.phone_number = null;
            } else {
                rc.phone_number = org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING.decode(object.get("phone_number"));
            }
        }
        if (object.get("delivery") != null) {
            if (object.get("delivery") instanceof com.google.gwt.json.client.JSONNull) {
                rc.delivery = false;
            } else {
                rc.delivery = org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.BOOLEAN.decode(object.get("delivery"));
            }
        }
        if (object.get("delivery-address") != null) {
            if (object.get("delivery-address") instanceof com.google.gwt.json.client.JSONNull) {
                rc.delivery_address = null;
            } else {
                rc.delivery_address = org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.toList(object.get("delivery-address"), org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.STRING);
            }
        }
        if (object.get("pizzas") != null) {
            if (object.get("pizzas") instanceof com.google.gwt.json.client.JSONNull) {
                rc.pizzas = null;
            } else {
                rc.pizzas = org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.toList(object.get("pizzas"), org.fusesource.restygwt.examples.client.Pizza_Generated_JsonEncoderDecoder_.INSTANCE);
            }
        }
        return rc;
    }
__method.json(org.fusesource.restygwt.examples.client.PizzaOrder_Generated_JsonEncoderDecoder_.INSTANCE.encode(request));
        try{
        __method.send(new org.fusesource.restygwt.client.AbstractRequestCallback<org.fusesource.restygwt.examples.client.OrderConfirmation>(__method,callback){
protected org.fusesource.restygwt.examples.client.OrderConfirmation parseResult()throws Exception{
        try{
public static final OrderConfirmation_Generated_JsonEncoderDecoder_ INSTANCE=new OrderConfirmation_Generated_JsonEncoderDecoder_();
public com.google.gwt.json.client.JSONValue encode(org.fusesource.restygwt.examples.client.OrderConfirmation value){
        if(value==null){
        return null;
        }
        com.google.gwt.json.client.JSONObject rc=new com.google.gwt.json.client.JSONObject();
        org.fusesource.restygwt.examples.client.OrderConfirmation parseValue=(org.fusesource.restygwt.examples.client.OrderConfirmation)value;
        {
        com.google.gwt.json.client.JSONValue v=org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.LONG.encode(parseValue.order_id);
        if(v!=null){
        rc.put("order_id",v);
        }
        }
        {
        com.google.gwt.json.client.JSONValue v=org.fusesource.restygwt.examples.client.PizzaOrder_Generated_JsonEncoderDecoder_.INSTANCE.encode(parseValue.order);
        if(v!=null){
        rc.put("order",v);
        }
        }
        {
        com.google.gwt.json.client.JSONValue v=org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.DOUBLE.encode(parseValue.price);
        if(v!=null){
        rc.put("price",v);
        }
        }
        {
        com.google.gwt.json.client.JSONValue v=org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.LONG.encode(parseValue.ready_time);
        if(v!=null){
        rc.put("ready_time",v);
        }
        }
        return rc;
        }
public OrderConfirmation decode(com.google.gwt.json.client.JSONValue value){
        if(value==null||value.isNull()!=null){
        return null;
        }
        com.google.gwt.json.client.JSONObject object=toObject(value);
        org.fusesource.restygwt.examples.client.OrderConfirmation rc=new org.fusesource.restygwt.examples.client.OrderConfirmation();
        if(object.get("order_id")!=null){
        if(object.get("order_id")instanceof com.google.gwt.json.client.JSONNull){
        rc.order_id=0L;
        }else{
        rc.order_id=org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.LONG.decode(object.get("order_id"));
        }
        }
        if(object.get("order")!=null){
        if(object.get("order")instanceof com.google.gwt.json.client.JSONNull){
        rc.order=null;
        }else{
        rc.order=org.fusesource.restygwt.examples.client.PizzaOrder_Generated_JsonEncoderDecoder_.INSTANCE.decode(object.get("order"));
        }
        }
        if(object.get("price")!=null){
        if(object.get("price")instanceof com.google.gwt.json.client.JSONNull){
        rc.price=0d;
        }else{
        rc.price=org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.DOUBLE.decode(object.get("price"));
        }
        }
        if(object.get("ready_time")!=null){
        if(object.get("ready_time")instanceof com.google.gwt.json.client.JSONNull){
        rc.ready_time=null;
        }else{
        rc.ready_time=org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.LONG.decode(object.get("ready_time"));
        }
        }
        return rc;
        }
        return org.fusesource.restygwt.examples.client.OrderConfirmation_Generated_JsonEncoderDecoder_.INSTANCE.decode(com.google.gwt.json.client.JSONParser.parse(__method.getResponse().getText()));
        }catch(Throwable __e){
        throw new org.fusesource.restygwt.client.ResponseFormatException("Response was NOT a valid JSON document",__e);
        }
        }
        });
        }catch(com.google.gwt.http.client.RequestException __e){
        callback.onFailure(__method,__e);
        }
        }
public void ping(org.fusesource.restygwt.client.MethodCallback<java.lang.Void>callback){
final org.fusesource.restygwt.client.Method __method=
        getResource()
        .resolve("/ping")
        .delete();
        __method.setDispatcher(this.dispatcher);
        __method.header(org.fusesource.restygwt.client.Resource.HEADER_ACCEPT,org.fusesource.restygwt.client.Resource.CONTENT_TYPE_JSON);
        try{
        __method.send(new org.fusesource.restygwt.client.AbstractRequestCallback<java.lang.Void>(__method,callback){
protected java.lang.Void parseResult()throws Exception{
        return(java.lang.Void)null;
        }
        });
        }catch(com.google.gwt.http.client.RequestException __e){
        callback.onFailure(__method,__e);
        }
        }
        }