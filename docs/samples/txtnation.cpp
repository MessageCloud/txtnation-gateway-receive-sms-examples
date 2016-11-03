#include <cpprest\http_listener.h>

using namespace web::http::experimental::listener;
using namespace web::http;
using namespace web;

class MyListener 
{
	public:
    	MyListener(const http::uri& url);

	private:
    	void handle_post(http_request request);
    	http_listener m_listener;        
};

MyListener::MyListener(const http::uri& url) : m_listener(http_listener(url))  
{
    m_listener.support(methods::POST, std::tr1::bind(&MyListener::handle_post, this, std::tr1::placeholders::_1));
};

void MyListener::handle_post(http_request message)
{
    message.reply(status_codes::OK, U("Hello"));
};