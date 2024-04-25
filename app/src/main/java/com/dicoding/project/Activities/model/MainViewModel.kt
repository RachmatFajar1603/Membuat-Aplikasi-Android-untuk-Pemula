import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dicoding.project.Activities.data.response.ItemsItem
import com.dicoding.project.Activities.data.response.UserResponse
import com.dicoding.project.Activities.data.retrofit.ApiConfig
import retrofit2.Call
import retrofit2.Response

class MainViewModel : ViewModel() {
    private val _userResponse = MutableLiveData<UserResponse>()
    val userResponse: MutableLiveData<UserResponse> = _userResponse

    private val _listUser = MutableLiveData<List<ItemsItem?>?>(null)
    val listUser: MutableLiveData<List<ItemsItem?>?> = _listUser

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: MutableLiveData<Boolean> = _isLoading

    companion object {
        private const val TAG = "MainViewModel"
    }

    fun findUser(userLogin: String) {
        _isLoading.value = true
        ApiConfig.getApiService().searchUser(userLogin).enqueue(object : retrofit2.Callback<UserResponse> {
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                _isLoading.value = false
                if (response.isSuccessful) {
                    _userResponse.value = response.body()
                    _listUser.value = response.body()?.items
                } else {
                    Log.e(TAG, "onFailure: ${response.message()}")
                }
            }

            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                _isLoading.value = false
                Log.e(TAG, "onFailure: ${t.message}")
            }
        })
    }
}
