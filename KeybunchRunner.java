class KeybunchRunner{
public static void main(String[]values)
{
	Key key=new Key(20,"Keychain");
	
	Key key1=new Key(13,"doll key chain");
Keybunch keybunch=new Keybunch("rubber",key);

Keybunch keybunch1=new Keybunch("plastic",key1);
keybunch.show();
}
}