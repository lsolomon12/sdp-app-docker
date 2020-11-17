libraries{
  docker {
    build_strategy = "dockerfile"
    registry = "docker-registry.default.svc:5000"
    cred = ""
    repo_path_prefix = "localhost:5000"
    remove_local_image = true
  }
}