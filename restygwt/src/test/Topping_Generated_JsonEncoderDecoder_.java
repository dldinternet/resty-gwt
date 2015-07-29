public class Topping_Generated_JsonEncoderDecoder_ {
    public final Topping_Generated_JsonEncoderDecoder_ INSTANCE = new Topping_Generated_JsonEncoderDecoder_();

    public com.google.gwt.json.client.JSONValue encode(org.fusesource.restygwt.examples.client.Topping value) {
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

    public Topping decode(com.google.gwt.json.client.JSONValue value) {
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

    return org.fusesource.restygwt.client.AbstractJsonEncoderDecoder.toList(com.google.gwt.json.client.JSONParser.parse(__method.getResponse().

    getText()

    ),org.fusesource.restygwt.examples.client.Topping_Generated_JsonEncoderDecoder_.INSTANCE);
}catch(Throwable __e){
        throw new org.fusesource.restygwt.client.ResponseFormatException("Response was NOT a valid JSON document",__e);
        }
        }
        });
        }catch(com.google.gwt.http.client.RequestException __e){
        callback.onFailure(__method,__e);
        }
        }
public void order(org.fusesource.restygwt.examples.client.PizzaOrder request,org.fusesource.restygwt.client.MethodCallback<org.fusesource.restygwt.examples.client.OrderConfirmation>callback){
final org.fusesource.restygwt.examples.client.PizzaOrder final_request=request;
final org.fusesource.restygwt.client.Method __method=
        getResource()
        .post();
        __method.setDispatcher(this.dispatcher);
        __method.header(org.fusesource.restygwt.client.Resource.HEADER_ACCEPT,org.fusesource.restygwt.client.Resource.CONTENT_TYPE_JSON);

        }