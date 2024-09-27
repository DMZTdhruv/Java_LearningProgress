#include <bits/stdc++.h>
using namespace std;

class IdkLets{
  private: 
    string name;
  public:
    IdkLets(string name) {
      this->name = name;
    }

    string getFullName() {
      return this->name;
    }
};

class SubIdk: public IdkLets {
  private:
    string subClassName;
  public:
    SubIdk(string subClassName,string name) : IdkLets(name) {
      this->subClassName = subClassName;
    }

    string getBothIdkName() {
      return subClassName + " " + getFullName();
    }
};


int main(void){
  SubIdk subIdk = SubIdk("Dhruv", "Well");
  cout <<  subIdk.getBothIdkName() << " ";
  return 0;
}