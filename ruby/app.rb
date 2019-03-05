class App
  def hello (user = nil)
    user ? "Hello #{user}" : "Hello world"
  end
end