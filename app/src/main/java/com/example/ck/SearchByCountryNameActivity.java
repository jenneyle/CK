package com.example.ck;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.ck.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class SearchByCountryNameActivity extends AppCompatActivity {
    private final String url = "https://restcountries.eu/rest/v2/all";
    private JsonArrayRequest request;
    private RequestQueue requestQueue;
    private RecyclerView recyclerView;
    // public List<Country> countryList = new ArrayList<>();
    //private CountryItemAdapter adapter = new CountryItemAdapter(countryList, );

    //private EditText editText;
    /*private RecyclerView recyclerView;
    private CatRowItemAdapter adapter = new CatRowItemAdapter(catList, getContext());*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_country_name);
        recyclerView = findViewById(R.id.country_name_recycler_view);

        jsonrequest();

    }

    private void jsonrequest() {
        request = new JsonArrayRequest(url, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                JSONObject jsonObject = null;
                for (int i = 0; i < response.length(); i++) {
                    try {
                        jsonObject = response.getJSONObject(i);

                        Country country = new Country();
                        country.setName(jsonObject.getString("name"));
                        country.setAlpha2Code(jsonObject.getString("alpha2Code"));
                        country.setCapital(jsonObject.getString("capital"));
                        country.setPopulation(jsonObject.getInt("population"));
                        country.setFlag(jsonObject.getString("flag"));
                        country.setContinent(jsonObject.getString("region"));

                        Country.countryList.add(country);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }

                setUpRecyclerView(Country.countryList);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        requestQueue = Volley.newRequestQueue(getApplicationContext());
        requestQueue.add(request);
    }

    public void setUpRecyclerView(List<Country> countryList) {
        CountryItemAdapter myAdapter = new CountryItemAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(myAdapter);

    }
}
