package ty.utils;

public enum endpoint {
	 
			list_of_user("/api/users?page=2"),
			Single_user("/api/users/2"),
			Single_resource("/api/unknown/2"),
			List_of_resource("/api/unknown"),
			Single_user_not_found("/api/users/23"),
			Single_resource_not_found("/api/unknown/23"),
			Delay_response("/api/users?delay=3");


			private String end;
			endpoint(String end)
			{
				this.end=end;
			}

			public String get_end()
			{
				return end;
			}
}
